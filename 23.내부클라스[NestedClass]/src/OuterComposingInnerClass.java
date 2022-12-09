
public class OuterComposingInnerClass {
	public int outer_member_field;
	public void outer_member_method() {
		System.out.println("OuterComposingInnerClass.outer_member_method()");
	}
	/************Outer클래스에서 Inner클래스 사용*********/
	public void outer_inner_class_use() {
		/*
		 * local
		 */
		int local_variable=100;
		/*
		ParentFirstConcreteClass childFirstConcreateClass=new ChildFirstConcreateClass();
		childFirstConcreateClass.local_inner_outer_access();
		*/
		ParentFirstConcreteClass childFirstConcreateClass = 
				new ParentFirstConcreteClass(){
					@Override
					public void local_inner_outer_access() {
						System.out.println("ParentFirstConcreteClass를 상속받는 "
								+ "ChildFirstConcreateClass에서 재정의한 local_inner_outer_access()");
					}
				};
		childFirstConcreateClass.local_inner_outer_access();		
		
	}
	
	/*
	 ParentFirstConcreteClass를 상속받고 
	 public void local_inner_outer_access() 메쏘드를 재정의하는 Inner클래스 
	*/
	/*
	public class ChildFirstConcreateClass extends ParentFirstConcreteClass{
					@Override
					public void local_inner_outer_access() {
						System.out.println("ParentFirstConcreteClass를 상속받는 "
								+ "ChildFirstConcreateClass에서 재정의한 local_inner_outer_access()");
					}
	}
	*/
	public static void main(String[] args) {
		OuterComposingInnerClass outerComposingInnerClass=new OuterComposingInnerClass();
		outerComposingInnerClass.outer_inner_class_use();
	}
	
}
class MyOuterClassDemo {
    private final int x = 1;

    public void innerInstance() {
        final MyInnerClassDemo inner = new MyInnerClassDemo();
        inner.seeOuter();
    }

    public void doThings() {
        final String name = "local variable";
        // inner class defined inside a method of outer class
        class MyInnerClassDemo1 {
            public void seeOuter() {
                System.out.println("Inner Demo 1 Outer Value of x is :" + x);
                System.out.println("Inner Demo 1 Value of name is :" + name);// compilation error!!
            } // close inner class method
        } // close inner class definition
    } // close Top level class method

    public static void main(final String args[]) {
        final MyOuterClassDemo.MyInnerClassDemo inner = new MyOuterClassDemo().new MyInnerClassDemo();
        inner.seeOuter();

        final MyOuterClassDemo outer = new MyOuterClassDemo();
        outer.doThings();
    }
    // inner class definition
    class MyInnerClassDemo {
        public void seeOuter () {
           System.out.println("InnerDemo Outer Value of x is :" + x);
        }
    } // close inner class definition	   
 } // close Top level class definition
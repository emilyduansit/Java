package Test;

import mypack.packagetest;



public class test {
    public static void main(String[] args)
    {
        packagetest.add();
        packagetest a = new  packagetest();
        a.show();

        StringBuilder builder = new StringBuilder(1);
        builder.append('a');
        String string = builder.toString();
        System.out.println(builder.charAt(0));

    }
}
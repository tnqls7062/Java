package java0425_class.part05;

public class Java069_variable {

	public static void main(String[] args) {
MemberVar mv=new MemberVar();
System.out.printf("Var_byte:%d\n",mv.var_byte);
System.out.printf("Var_short:%d\n",mv.var_short);
System.out.printf("Var_int:%d\n",mv.var_int);
System.out.printf("Var_long:%d\n",mv.var_long);
System.out.printf("Var_float:%.1f\n",mv.var_float);
System.out.printf("Var_double:%.1f\n",mv.var_double);
System.out.printf("Var_boolean:%b\n",mv.var_boolean);
System.out.printf("Var_char:%c\n",mv.var_char);
System.out.printf("int[]=%s\n",mv.num);
System.out.printf("String=%d\n",mv.stn);

	}

}

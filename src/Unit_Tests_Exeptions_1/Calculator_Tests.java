package Unit_Tests_Exeptions_1;

public class Calculator_Tests {
    public static void main(String[] args) {

//        if (4 != Calculator.calculation(2,2,'+')) {
//            throw new AssertionError("Mistake of Method execution");
//        }
//        if (2 != Calculator.calculation(4,2,'-')) {
//            throw new AssertionError("Mistake of Method execution");
//        }
//        if (4 != Calculator.calculation(8,2,'/')) {
//            throw new AssertionError("Mistake of Method execution");
//        }
//        if (6 != Calculator.calculation(3,2,'*')) {
//            throw new AssertionError("Mistake of Method execution");
//        }

        assert 4 == Calculator.calculation(2,2,'+');
        assert 2 == Calculator.calculation(4,2,'-');
        assert 4 == Calculator.calculation(8,2,'/');
        assert 6 == Calculator.calculation(3,2,'*');
//
//        try {
//            Calculator.calculation(8,4,'_');
//        } catch (IllegalStateException e) {
//            if (!e.getMessage().equals("Unexpected value operator: _")){
//                throw new AssertionError("Mistake");
//            }
//        }
//
    }
}

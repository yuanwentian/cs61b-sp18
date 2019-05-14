import static org.junit.Assert.*;
import org.junit.Test;

public class TestArrayDequeGold {

    @Test
    public void testStudentArrayDeque() {
        StudentArrayDeque<Integer> test1 = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> test2 = new ArrayDequeSolution<>();
        Integer studentOutput;
        Integer correctOutput;
        while (true) {
            double numberBetweenZeroAndOne = StdRandom.uniform();
            int number = StdRandom.uniform(10);
            if (numberBetweenZeroAndOne > 0.75) {
                test1.addFirst(number);
                test2.addFirst(number);
                System.out.printf("addFirst(%d)\n", number);
            } else if (numberBetweenZeroAndOne >= 0.5 && numberBetweenZeroAndOne < 0.75) {
                test1.addLast(number);
                test2.addLast(number);
                System.out.printf("addLast(%d)\n", number);
            } else if (numberBetweenZeroAndOne < 0.5 && numberBetweenZeroAndOne >= 0.25
                    && !test1.isEmpty() && !test2.isEmpty()) {
                studentOutput = test1.removeFirst();
                correctOutput = test2.removeFirst();
                System.out.printf("removeFirst()\n");
                assertEquals(correctOutput, studentOutput);
            } else if (numberBetweenZeroAndOne >= 0 && numberBetweenZeroAndOne < 0.25
                    && !test1.isEmpty() && !test2.isEmpty()) {
                studentOutput = test1.removeLast();
                correctOutput = test2.removeLast();
                System.out.printf("removeLast()\n");
                assertEquals(correctOutput, studentOutput);
            } else  {
                assertEquals(test2.isEmpty(), test1.isEmpty());
            }
        }
    }
}

/**

import static org.junit.Assert.*;
import org.junit.Test;

public class TestArrayDequeGold {
//
 //    @Test
 //    public void testArrayDeque() {
 //        StudentArrayDeque<Integer> sad1 = new StudentArrayDeque<>();
 //        ArrayDequeSolution<Integer> exp1 = new ArrayDequeSolution<>();
 //        for (int i = 0; i < 10; i += 1) {
 //            double numberBetweenZeroAndOne = StdRandom.uniform();
 //            if (numberBetweenZeroAndOne < 0.5) {
 //                sad1.addLast(i);
 //                exp1.addLast(i);
 //            } else {
 //                sad1.addFirst(i);
 //                exp1.addFirst(i);
 //            }
 //        }
 //        sad1.printDeque();
 //        for (int i = 0; i < 10; i += 1) {
 //            Integer x = sad1.removeFirst();
 //            Integer x_expected = exp1.removeFirst();
 //            assertEquals(x_expected, x);
 //        }
 //
 //
 //    }

    @Test
    public void testArrayDeque() {
        StudentArrayDeque<Integer> student = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> solution = new ArrayDequeSolution<>();
        OperationSequence fs = new OperationSequence();

        //source from StudentArrayDequeLauncher.java
        for (int i = 0; i < 10; i += 1) {
            double numberBetweenZeroAndOne = StdRandom.uniform();
            if (numberBetweenZeroAndOne < 0.5) {
                student.addLast(i);
                solution.addLast(i);
                DequeOperation randomAddLast = new DequeOperation("addLast", i);
                fs.addOperation(randomAddLast);
            }else {
                student.addFirst(i);
                solution.addFirst(i);
                DequeOperation randomAddFirst = new DequeOperation("addFirst", i);
                fs.addOperation(randomAddFirst);
            }
        }


        Integer a = solution.removeFirst();
        Integer b = student.removeFirst();
        DequeOperation dequeOp1 = new DequeOperation("RemoveFirst");
        fs.addOperation(dequeOp1);
        assertEquals(fs.toString(),a,b);

        Integer c = solution.removeLast();
        Integer d = student.removeLast();
        DequeOperation dequeOp2 = new DequeOperation("RemoveLast");
        fs.addOperation(dequeOp2);
        assertEquals(fs.toString(),c,d);

        Integer e = solution.removeFirst();
        Integer f = student.removeFirst();
        DequeOperation dequeOp3 = new DequeOperation("RemoveFirst");
        fs.addOperation(dequeOp3);
        assertEquals(fs.toString(),e,f);

        Integer g = solution.removeLast();
        Integer h = student.removeLast();
        DequeOperation dequeOp4 = new DequeOperation("RemoveLast");
        fs.addOperation(dequeOp4);
        assertEquals(fs.toString(),g,h);

        Integer i = solution.removeFirst();
        Integer j = student.removeFirst();
        DequeOperation dequeOp5 = new DequeOperation("RemoveFirst");
        fs.addOperation(dequeOp5);
        assertEquals(fs.toString(),i,j);

        Integer k = solution.removeLast();
        Integer l = student.removeLast();
        DequeOperation dequeOp6 = new DequeOperation("RemoveLast");
        fs.addOperation(dequeOp6);
        assertEquals(fs.toString(),k,l);

        Integer m = solution.removeFirst();
        Integer n = student.removeFirst();
        DequeOperation dequeOp7 = new DequeOperation("RemoveFirst");
        fs.addOperation(dequeOp7);
        assertEquals(fs.toString(),m,n);
    }
}
 */

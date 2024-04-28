package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

public class ExceptionHandling {
    public static void main(String[] args) throws UnknownHostException, IOException {
        try {
            // ExceptionType1: ArithmeticException
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }

        try {
            // ExceptionType2: NullPointerException
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }

        try {
            // ExceptionType3: ArrayIndexOutOfBoundsException
            int[] arr = new int[5];
            int value = arr[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }

        try {
            // ExceptionType4: IndexOutOfBoundsException
            String str = "hello";
            char ch = str.charAt(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException occurred: " + e.getMessage());
        }

        try {
            // ExceptionType5: NumberFormatException
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        }

        try {
            // ExceptionType6: ClassCastException
            Object obj = new Integer(10);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException occurred: " + e.getMessage());
        }

        try {
            // ExceptionType7: IllegalArgumentException
            int age = -10;
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
        }

        try {
            // ExceptionType8: IllegalStateException
            throw new IllegalStateException("Illegal state detected");
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException occurred: " + e.getMessage());
        }

        try {
            // ExceptionType9: UnsupportedOperationException
            throw new UnsupportedOperationException("Operation not supported");
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException occurred: " + e.getMessage());
        }

        try {
            // ExceptionType10: ConcurrentModificationException
            java.util.List<String> list = new java.util.ArrayList<>();
            list.add("one");
            for (String s : list) {
                list.remove(0);
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException occurred: " + e.getMessage());
        }

        try {
            // ExceptionType11: NoSuchElementException
            java.util.Iterator<String> iterator = java.util.Arrays.asList("one", "two").iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
            iterator.next(); // Trying to access next element when there's none
        } catch (java.util.NoSuchElementException e) {
            System.out.println("NoSuchElementException occurred: " + e.getMessage());
        }

        try {
            // ExceptionType12: NullPointerException
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }

        try {
            // ExceptionType13: NegativeArraySizeException
            int[] arr = new int[-3];
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException occurred: " + e.getMessage());
        }

        try {
            // ExceptionType14: StringIndexOutOfBoundsException
            String str = "hello";
            char ch = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred: " + e.getMessage());
        }

        try {
            // ExceptionType15: FileNotFoundException
            try {
                FileInputStream fis = new FileInputStream("nonexistentfile.txt");
            } catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException occurred: " + e.getMessage());
            }

            // File not found scenario
            try {
                FileInputStream fis = new FileInputStream("test.txt");
                // Perform operations with the file
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            // ExceptionType16: IOException
            try {
                FileInputStream fis = new FileInputStream("test.txt");
                fis.close(); // Closing a file that was never opened
            } catch (IOException e) {
                System.out.println("IOException occurred: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            // ExceptionType17: EOFException
            try {
                java.io.DataInputStream dis = new java.io.DataInputStream(new java.io.FileInputStream("test.txt"));
                dis.read(); // Trying to read beyond end of file
            } catch (java.io.EOFException e) {
                System.out.println("EOFException occurred: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            // ExceptionType18: SocketException
            try {
                java.net.Socket socket = new java.net.Socket("localhost", 8080);
                socket.close();
                socket.getOutputStream().write(new byte[1024]); // Writing to a closed socket
            } catch (java.net.SocketException e) {
                System.out.println("SocketException occurred: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            // ExceptionType19: SQLException
            try {
                java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "user", "password");
            } catch (java.sql.SQLException e) {
                System.out.println("SQLException occurred: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            // ExceptionType20: InterruptedException
            try {
                Thread.sleep(1000); // Sleeping interrupted
            } catch (InterruptedException e) {
                System.out.println("InterruptedException occurred: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

package Collections;

public class student implements Comparable<student>{
    int roll_no;
    String name;

    public student(int roll_no,String name)
    {
        this.roll_no=roll_no;
        this.name=name;
    }
        @Override
        public String toString()
        {
            return "student{roll_no="+roll_no+",name='"+name+"'}";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            student student = (student) obj;
            return roll_no == student.roll_no;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(roll_no);
        }

        @Override
        public int compareTo(student that)
        {
            return this.roll_no-that.roll_no;
        }


}

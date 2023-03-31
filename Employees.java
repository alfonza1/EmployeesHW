package labs.employees;


    public class Employees extends Person {
       private int id;
      private String name;

        private static int uniqueId = 0;

        public Employees(String name) {
            super(name);
           id = ++uniqueId;
           this.name = name;
        }

        @Override
        public int getId() {
            return id;
        }




}

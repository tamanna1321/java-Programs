package package4;

   public abstract class Employee {
        private String name;
        private String number;

        public Employee(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public String getname() {
            return name;
        }

        public String getnumber() {
            return number;
        }

        @Override
        public String toString() {
            return "Employee name=" + name + "number" + number;
        }
    }
    


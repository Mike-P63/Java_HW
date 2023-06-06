package HomeWork6;

    public class NoteBook {
        String brand;
        String model;
        String color;

        // Конструктор
        public NoteBook(String brand, String model, String color){
            this.brand = brand.toUpperCase();
            this.model = model.toUpperCase();
            this.color = color.toLowerCase();
        }

        public String getBrand() {
            return brand;
        }

        public String getColor() {
            return color;
        }

        public void showInfo(){
            System.out.println(String.format("Производитель: %s\nМодель: %s\nЦвет: %s\n",
                    this.brand, this.model, this.color));
        }

        public String toString() {
            return (String.format("Производитель: %s\nМодель: %s\nЦвет: %s\n"+"\n",
                    this.brand, this.model, this.color));
        }
    }


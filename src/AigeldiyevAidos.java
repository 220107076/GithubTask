import java.util.Scanner;


    public class AigeldiyevAidos {
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            greeting();
            travelTimeBudget();
            timeDifference();
            countryArea();
            NextDestination();
        }

        public static void greeting() {
            System.out.println("Welcome to Vacation Planner!");
            System.out.print("What is your name: ");
            String name = scan.nextLine();
            System.out.print("Nice to meet you " + name + " where are you traveling to? ");
            String place = scan.nextLine();
            System.out.println("Creat! " + place + " sounds like a great trip");
        }

        public static void travelTimeBudget() {
            System.out.print("How many days are you going to spend traveling? ");
            int days = scan.nextInt();
            System.out.print("How much money, in USD, are you planning to spend on your trip: ");
            double money = scan.nextInt();
            System.out.print("What is the three letter currency symbol for your travel destination? ");
            String volute = scan.next();
            System.out.print("How many " + volute + " are there in 1 USD? ");
            double himVolute = scan.nextDouble();
            int hour = days * 24;
            int minus = hour * 60;
            int seconds = minus * 60;
            double spend = (int) ((money / days) * 100) / 100.0;
            double money2 = money * himVolute;
            double spend2 = (int) ((money2 / days) * 100) / 100.0;

            System.out.println("If you are traveling for " + days + " days " + "that is same as " + hour + " or " + minus + " minus or " + seconds +
                    " seconds. ");
            System.out.println("If you are going to spend " + money + " USD that means per day you can spend up to " + spend + " USD");
            System.out.println("Your total budget in EUR is " + money2 + " EUR, which per day is " + spend2 + " EUR");
        }

        public static void timeDifference() {
            System.out.print("What is the time difference, in hours, between your home and your destination? ");
            int time = scan.nextInt();
            int noon = (time + 12)%24;
            int night = (time + 24)%24;

            System.out.println("That means that when it is midnight at home it will be " + night + ":00 in your travel\n" +
                    "destination and when it's noon at home it will be " + noon + ":00");
        }



        public static void countryArea() {
            System.out.print("What is square area of your destination country in km2? ");
            double destination = scan.nextInt();
            double miles2 = (int) ((destination / 2.59) * 100) / 100.0;
            System.out.println("In miles2 that is " + miles2);
        }

        public static void NextDestination() {
            System.out.print("How many places you traveled to :");
            int a = scan.nextInt();
            for (int i = 0; i < a; i++) {
                System.out.print("Enter the name: ");
                String count = scan.next();
            }
            System.out.println("Next place you want to travel to :");
            System.out.println("0: Italy\n" +
                    "1: England\n" +
                    "2: Netherlands\n" +
                    "3: Germany\n" +
                    "4: France ");
            System.out.print("Your input should be -> ");
            int Country = scan.nextInt();
            switch (Country) {
                case 0:
                    System.out.println("Thank you, Your next location is :Italy");
                    break;
                case 1:
                    System.out.println("Thank you, Your next location is : England ");
                    break;
                case 2:
                    System.out.println("Thank you, Your next location is :Netherlands");
                    break;
                case 3:
                    System.out.println("Thank you, Your next location is :Germany");
                    break;
                case 4:
                    System.out.println("Thank you, Your next location is :France");
                    break;

            }
        }
    }




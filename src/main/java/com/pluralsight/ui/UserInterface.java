//.out.println("Add sauces (type 'done' to finish):");
//        while (true) {
//            String sauce = getStringInput("Sauce: ");
//            if (sauce.equalsIgnoreCase("done")) break;
//            sandwich.addSauce(sauce);
//        }
//
//    public void showOrderSummary(Order order) {
//        System.out.println("\n✅ Order Summary:");
//        System.out.println(order.getOrderSummary());
//
//    }
//
//    private boolean getYesNo(String prompt) {
//        String input = getStringInput(prompt);
//        return input.equalsIgnoreCase("yes");
//    }
//
//    private int getIntInput(String prompt) {
//        while (true) {
//            System.out.print(prompt);
//            try {
//                return Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid number. Try again.");
//            }
//        }
//    }
//
//    private String getStringInput(String prompt) {
//        System.out.print(prompt);
//        return scanner.nextLine().trim();
//    }
//}
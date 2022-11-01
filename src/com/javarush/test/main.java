package com.javarush.test;

public class main {
    public static void main(String[] args) {
        // ИС «Гостиница».

        guest first = new guest("Элвира Иванова Ивановна ", 89143360118L);

        System.out.println("Имя постояльца : " + first.getName());
        System.out.println("Указаный номер - " + first.getPhone());

        addressGuest addressGuest = new addressGuest("г. Санкт-Петербург", " ул. Бабушкина, дом:", 21);
        System.out.println("Адрес : " + args.getClass() + addressGuest.getStreet() + addressGuest.getHouse_number());

        room room = new room("Наличие вайфая - Есть, дата ", 2022, "Название - Всё включено, ", " Отель - , три звезды ", 2);
        System.out.println("Выбранная комната : " + com.javarush.test.room.getName() + com.javarush.test.room.getWifi() + com.javarush.test.room.getTheDate() + com.javarush.test.room.getroomName() + com.javarush.test.room.getTheDate());

        rooms Office = new rooms(" г.Санкт-Петербург, Линия 6, дом 45", "Ария");
        System.out.println("номер : " + rooms.getOffice() + rooms.getaddres());

        Payment price = new Payment(500);///Стоимость
        System.out.println("Стоимтость заказа : " + Payment.getPayment());

        employees Employee = new employees("Мария", 89314671042L);
        System.out.println("Сотрудник : " + Employee.getName());
        System.out.println("Номер для связи - " + Employee.getPhone());

        Hotels Hotel = new Hotels("Граф, контактный номер - ", 8961356781L);
        System.out.println("Москва");
        hotelsRating Hotels = new hotelsRating(5, 5, 4, 10);
        int Rating = Hotels.getReviews() + Hotels.getPopularity() + Hotels.getPrice() + Hotels.getService();

        System.out.println("Рейтинг гостиницы :" + Rating);
        boolean Hotel1 = (Rating <= 35) && (Rating >= 30);
        boolean Hotel2 = (Rating <= 30) && (Rating >= 25);
        boolean Hotel3 = (Rating <= 25) && (Rating >= 15);
        boolean Hotel4 = (Rating <= 15) && (Rating >= 0);
        {
            if (Hotel1) {
                System.out.println("Первое место");
            } else if (Hotel2) {
                System.out.println("Второе место");
            } else if (Hotel3) {
                System.out.println("Третье место");
            } else if (Hotel4) {
                System.out.println("Четвертое место");
            }
        }
        roomRating rooms = new roomRating(5, 5, 5);
        int Ratings = rooms.getReviews() + rooms.getPopularity() + rooms.getNumberOfcopies();
        {
            System.out.println("Рейтинг книги :" + Ratings);
            boolean rooms1 = (Ratings <= 15) && (Ratings >= 10);
            boolean rooms2 = (Ratings <= 10) && (Ratings >= 5);
            boolean rooms3 = (Ratings <= 5) && (Ratings >= 1);
            boolean rooms4 = (Ratings <= 1) && (Ratings >= 0);
            {
                if (rooms1) {
                    System.out.println("Первое место");
                } else if (rooms2) {
                    System.out.println("Второе место");
                } else if (rooms3) {
                    System.out.println("Третье место");
                } else if (rooms4) {
                    System.out.println("Четвертое место");
                }
            }
            printing firstPrinting = new printing(1, 800, "Ария");
            System.out.println("Выпуск: " + firstPrinting.getNumber());
            System.out.println("Номер комнаты : " + firstPrinting.getNumberOfrooms());
            System.out.println("Комната : " + firstPrinting.getRoom());

        }
    }
}



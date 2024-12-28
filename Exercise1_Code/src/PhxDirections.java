import java.util.*;

public class PhxDirections {
    public static void main(String[] args) {
        System.out.println("Downtown Phoenix");
        System.out.println(" ___  ,--.  __________________________/   ,   /_______\n" +
                "    'O---O'~\n" +
                " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _   ,--.   _ _ _ _ _\n" +
                "         _____                       ~'O---O'\n" +
                " ______        _____        __________________________\n" +
                "           ||      /   ,   /\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Direction:");
        String direction = sc.next().toUpperCase();

        System.out.println("Street Number:");
        int street_num = sc.nextInt();

        System.out.println("Street Type:");
        String street_type = sc.next().toUpperCase();


        String sideOfCentral;
        String positionRelative_ToWAStreet;

        String precedingStreetType = street_type;
        int precedingStreetNum = street_num;

        positionRelative_ToWAStreet = (direction.equals("NORTH") ? "North" : "South");


        if (street_type.equals("AVENUE") || street_type.equals("DRIVE") || street_type.equals("LANE")) {
            sideOfCentral = "west";

            if (street_type.equals("AVENUE")) {
                sideOfCentral = "east";
                precedingStreetNum = street_num - 1;
            }
            else
            {
                precedingStreetType = "avenue";
            }
        }
        else {
            sideOfCentral = "east";

            if (street_type.equals("STREET")) {
                sideOfCentral = "west";
                precedingStreetNum = street_num - 1;
            }
            else
            {
                precedingStreetType = "street";
            }
        }

            System.out.println(direction + " " + street_num + " " + street_type +
                    " is " + street_num + " blocks " + sideOfCentral + " of Central Avenue "
                    + "and is " + positionRelative_ToWAStreet + " of Washington Street.");

            System.out.println("The preceding " + precedingStreetType + " is " +
                    positionRelative_ToWAStreet + " " + precedingStreetNum + " " +
                    precedingStreetType + ".");
        }
    }
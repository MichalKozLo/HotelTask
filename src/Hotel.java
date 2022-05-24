public class Hotel {
    private int[] rooms = new int[]{1, 1, 0, 1, 0, 0, 1, 0, 0, 0};

    public int closeFirstOpenRoom() {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == 0) {
                rooms[i] = 1;
                return i;
            }
        }
        return -1;
    }

    public void openRoom(int roomNumber) {
        if (roomNumber < rooms.length && roomNumber >= 0) {
            rooms[roomNumber] = 0;
        }
    }

    public String toString() {
        String roomsArray = "";
        for (int room : rooms) {
            roomsArray += room + ", ";
        }
        return roomsArray.substring(0, roomsArray.length() - 2);
    }
}

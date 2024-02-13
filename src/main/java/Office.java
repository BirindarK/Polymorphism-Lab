public class Office extends Commercial{



        private int numberOfEmployee;
        private boolean hasConferenceRoom;
        private int proximityToClient;

        public Office(int numberOfRooms, int numberOfBathrooms, String dateOfConstruction, int squareFootage, String location, String companyName, String typeOfCommercialProperty, int profitGenerated, int numberOfEmployee, boolean hasConferenceRoom, int proximityToClient) {
            super(numberOfRooms, numberOfBathrooms, dateOfConstruction, squareFootage, location, companyName, typeOfCommercialProperty, profitGenerated);
            this.numberOfEmployee = numberOfEmployee;
            this.hasConferenceRoom = hasConferenceRoom;
            this.proximityToClient = proximityToClient;
        }

        public int getNumberOfEmployee() {
            return this.numberOfEmployee;
        }

        public boolean getHasConferenceRoom() {

            return this.hasConferenceRoom;
        }

        public int getProximityToClient() {
            return this.proximityToClient;
        }


}

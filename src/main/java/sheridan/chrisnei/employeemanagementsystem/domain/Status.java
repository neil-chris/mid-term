package sheridan.chrisnei.employeemanagementsystem.domain;

/**
 * The work status of the employee
 */
public enum Status {

    /**
     * A constant representing a full time employee status
     */
    FULL_TIME {
        @Override
        public String toString() {
            return "Full Time";
        }
    },

    /**
     * A constant representing a part time employee status
     */
    PART_TIME {
        @Override
        public String toString() {
            return "Part time";
        }
    },

    /**
     * A constant representing a seasonal time employee status
     */
    SEASONAL {
        @Override
        public String toString() {
            return "Seasonal";
        }
    }
}

package net.osmtracker.db.model;

/* 
Proposed model for storing descriptive waypoint attributes.
Each attribute belongs to an existing waypoint identified by UUID.
*/
public class WaypointAttribute {

    private final String waypointUuid;
    private final String key;
    private final String value;

    public WaypointAttribute(String waypointUuid, String key, String value) {
        this.waypointUuid = waypointUuid;
        this.key = key;
        this.value = value;
    }

    public String getWaypointUuid() {
        return waypointUuid;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

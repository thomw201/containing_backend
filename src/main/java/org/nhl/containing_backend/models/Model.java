package org.nhl.containing_backend.models;

import org.nhl.containing_backend.cranes.MoveableCrane;
import org.nhl.containing_backend.cranes.RailCrane;
import org.nhl.containing_backend.vehicles.Agv;
import org.nhl.containing_backend.vehicles.Transporter;

import java.util.List;

/**
 * Representation of the state of the program.
 */
public class Model {
    private List<Agv> agvs;
    private List<Transporter> transporters;
    private Storage storage;
    private List<RailCrane> railCranes;
    private List<MoveableCrane> moveableCranes;

    public Model() {
    }
}
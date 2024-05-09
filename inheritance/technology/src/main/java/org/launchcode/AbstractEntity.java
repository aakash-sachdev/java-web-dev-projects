package org.launchcode;

import java.util.UUID;

public abstract class AbstractEntity {
    // Define a unique ID property
    private final UUID id;

    // Constructor to initialize the ID
    public AbstractEntity() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}
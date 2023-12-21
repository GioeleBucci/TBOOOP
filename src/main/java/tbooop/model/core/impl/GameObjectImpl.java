package tbooop.model.core.impl;

import javafx.geometry.Point2D;
import tbooop.model.core.api.GameObject;

import java.util.Objects;

/**
 * A GameObject is an abstraction of anything that is present in the game.
 * Every class must estend it, directly or not.
 */
public abstract class GameObjectImpl implements GameObject {

    private Point2D position;

    /**
     * Create a new istance of a GameObject.
     * 
     * @param position starting position (as a {@link javafx.geometry.Point2D
     *                 Point2D})
     * @throws NullPointerException if any parameter passed is null
     */
    protected GameObjectImpl(final Point2D position) {
        this.position = Objects.requireNonNull(position);
    }

    /** {@inheritDoc} */
    @Override
    public Point2D getPosition() {
        return this.position;
    }

    /** {@inheritDoc} */
    @Override
    public void setPosition(final Point2D newPos) {
        this.position = Objects.requireNonNull(newPos);
    }

}
package com.stackroute.domain;

/**
 * Hello world!
 *
 */
public class Movie
{
    Actor actor;

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}

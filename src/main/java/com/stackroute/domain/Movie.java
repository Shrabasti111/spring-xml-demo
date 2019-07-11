package com.stackroute.domain;

/**
 * Hello world!
 *
 */
public class Movie
{
    Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public Actor getActor() {
        return actor;
    }

}

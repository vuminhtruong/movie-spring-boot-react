package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // co nhiem vu thao tac du lieu
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdbId);
}

//MongoRepository<Movie, ObjectId> - la mot repository thao tac voi doi tuong Movie,ObjectId la _id
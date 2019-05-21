package com.graphql.schemabased.springbootgraphqlschemabased.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.graphql.schemabased.springbootgraphqlschemabased.model.Link;

@Repository
public interface ILinkRepository extends MongoRepository<Link, String> {

}

package com.graphql.schemabased.springbootgraphqlschemabased.resolvers;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.graphql.schemabased.springbootgraphqlschemabased.model.Link;
import com.graphql.schemabased.springbootgraphqlschemabased.repository.ILinkRepository;

public class Mutation implements GraphQLRootResolver {

	private ILinkRepository linkRepository;

	public Mutation(ILinkRepository linkRepo) {
		this.linkRepository = linkRepo;
	}

	public Link createLink(String url, String description) {
		Link newLink = new Link(url, description);
		return linkRepository.save(newLink);
	}
}
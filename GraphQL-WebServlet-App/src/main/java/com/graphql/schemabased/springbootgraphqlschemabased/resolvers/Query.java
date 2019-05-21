package com.graphql.schemabased.springbootgraphqlschemabased.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.graphql.schemabased.springbootgraphqlschemabased.model.Link;
import com.graphql.schemabased.springbootgraphqlschemabased.repository.ILinkRepository;

public class Query implements GraphQLRootResolver {

	private ILinkRepository linkRepository;

	public Query(ILinkRepository linkRepo) {
		this.linkRepository = linkRepo;
	}

	public List<Link> allLinks() {
		return linkRepository.findAll();
	}
	
	public Link createLink(String url, String description) {
		Link newLink = new Link(url, description);
		return linkRepository.save(newLink);
	}
}
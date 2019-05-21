package com.graphql.schemabased.springbootgraphqlschemabased.config;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;
import com.graphql.schemabased.springbootgraphqlschemabased.repository.ILinkRepository;
import com.graphql.schemabased.springbootgraphqlschemabased.resolvers.Mutation;
import com.graphql.schemabased.springbootgraphqlschemabased.resolvers.Query;

import graphql.servlet.SimpleGraphQLServlet;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLConfig extends SimpleGraphQLServlet {

	private static final long serialVersionUID = 1L;

	public GraphQLConfig(ILinkRepository linkRepo) {
		super(SchemaParser.newParser().file("schema.graphqls").resolvers(new Query(linkRepo), new Mutation(linkRepo))
				.build().makeExecutableSchema());
	}

}
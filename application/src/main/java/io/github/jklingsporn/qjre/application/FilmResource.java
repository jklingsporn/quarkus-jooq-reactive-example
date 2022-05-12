package io.github.jklingsporn.qjre.application;

import io.github.jklingsporn.qjre.schema.Tables;
import io.github.jklingsporn.qjre.schema.tables.daos.FilmDao;
import io.github.jklingsporn.qjre.schema.tables.pojos.Film;
import io.smallrye.mutiny.Uni;
import org.jboss.resteasy.reactive.RestPath;
import org.jboss.resteasy.reactive.RestQuery;
import org.jooq.impl.DSL;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.List;

@Path("/film")
public class FilmResource {

    private final FilmDao filmDao;

    @Inject
    public FilmResource(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<Film>> list(@RestQuery("limit") Integer limit, @RestQuery("offset") Integer offset) {
        return filmDao.findManyByCondition(DSL.trueCondition(),limit,offset,Tables.FILM.RELEASE_YEAR.asc());
    }

    @GET
    @Path("/{id:\\d+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Film> getFilmsById(Integer id) {
        return filmDao.findOneById(id.shortValue());
    }
}
/*
 * This file is generated by jOOQ.
 */
package com.mrdave19.PSStoreGameScraperV3.entity.jooq.games;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import com.mrdave19.PSStoreGameScraperV3.entity.jooq.DefaultCatalog;
import com.mrdave19.PSStoreGameScraperV3.entity.jooq.games.tables.Psstoregamess;
import com.mrdave19.PSStoreGameScraperV3.entity.jooq.games.tables.PsstoregamessAuditLog;
import com.mrdave19.PSStoreGameScraperV3.entity.jooq.games.tables.Revinfo;


/**
 * This class is generated by jOOQ.
 */

@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Games extends SchemaImpl {

    private static final long serialVersionUID = -1126641077;

    /**
     * The reference instance of <code>games</code>
     */
    public static final Games GAMES = new Games();

   
    /**
     * The table <code>games.psstoregamess</code>.
     */
    public final Psstoregamess PSSTOREGAMESS = com.mrdave19.PSStoreGameScraperV3.entity.jooq.games.tables.Psstoregamess.PSSTOREGAMESS;

    /**
     * The table <code>games.psstoregamess_audit_log</code>.
     */
    public final PsstoregamessAuditLog PSSTOREGAMESS_AUDIT_LOG = com.mrdave19.PSStoreGameScraperV3.entity.jooq.games.tables.PsstoregamessAuditLog.PSSTOREGAMESS_AUDIT_LOG;

   
    /**
     * The table <code>games.revinfo</code>.
     */
    public final Revinfo REVINFO = com.mrdave19.PSStoreGameScraperV3.entity.jooq.games.tables.Revinfo.REVINFO;

    /**
     * No further instances allowed
     */
    private Games() {
        super("games", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(

            Psstoregamess.PSSTOREGAMESS,
            PsstoregamessAuditLog.PSSTOREGAMESS_AUDIT_LOG,
            Revinfo.REVINFO);
    }
}

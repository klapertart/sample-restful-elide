package com.klapertart.elide.config;

import com.yahoo.elide.Elide;
import com.yahoo.elide.ElideSettingsBuilder;
import com.yahoo.elide.core.datastore.DataStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
public class ElideConfig {

    @Bean
    public Elide initializeElide(DataStore dataStore) {
        ElideSettingsBuilder builder = new ElideSettingsBuilder(dataStore);
        // Configure Elide settings as needed
        return new Elide(builder.build());
    }
}

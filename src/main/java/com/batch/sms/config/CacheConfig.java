package com.batch.sms.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Enables Spring's caching abstraction. The actual cache store (Redis)
 * is picked up automatically from spring.cache.type=redis in
 * application.properties — no RedisCacheManager bean needs to be
 * defined by hand for the default settings we're using.
 */
@Configuration
@EnableCaching
public class CacheConfig {
}

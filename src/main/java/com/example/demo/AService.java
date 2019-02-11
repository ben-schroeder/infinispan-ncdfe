package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.infinispan.manager.EmbeddedCacheManager;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
@RequiredArgsConstructor
public class AService {

  private final EmbeddedCacheManager cacheManager;

  @PostConstruct
  public void init() {
    log.info("cache entries: " + cacheManager.getCache("a-cache").size());
  }

}

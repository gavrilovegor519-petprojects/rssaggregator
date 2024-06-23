package com.egor.rssaggregator.service;

import com.egor.rssaggregator.dto.output.feed.NewsEntryDto;
import com.egor.rssaggregator.entity.Feed;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Management of feeds service layer.
 * @author Egor Gavrilov (gavrilovegor519@gmail.com)
 */
public interface FeedService {
    /**
     * Add new feed.
     * @param feed Add feed DTO.
     * @param email Email of user who added feed.
     */
    void addFeed(Feed feed, String email);

    /**
     * Get all feeds.
     * @param email Email of user who requested feeds.
     * @return List of feeds.
     */
    List<Feed> getFeeds(String email);

    /**
     * Delete feed.
     * @param id ID of feed.
     * @param email Email of user who deleted feed.
     */
    void deleteFeed(long id, String email);

    /**
     * Get news headings.
     * @param email Email of user who requested news.
     * @param pageable Pageable object.
     * @return List of news headings.
     */
    Page<NewsEntryDto> getNewsHeadings(String email, Pageable pageable);
}

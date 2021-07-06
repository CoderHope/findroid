package dev.jdtech.jellyfin.repository

import org.jellyfin.sdk.model.api.BaseItemDto
import org.jellyfin.sdk.model.api.ItemFields
import java.util.*

interface JellyfinRepository {
    suspend fun getItem(itemId: UUID): BaseItemDto

    suspend fun getItems(parentId: UUID? = null): List<BaseItemDto>

    suspend fun getSeasons(seriesId: UUID): List<BaseItemDto>

    suspend fun getNextUp(seriesId: UUID): List<BaseItemDto>

    suspend fun getEpisodes(seriesId: UUID, seasonId: UUID, fields: List<ItemFields>? = null): List<BaseItemDto>
}
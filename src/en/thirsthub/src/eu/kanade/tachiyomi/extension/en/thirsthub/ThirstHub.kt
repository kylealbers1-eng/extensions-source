package eu.kanade.tachiyomi.extension.en.thirsthub

import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.MangasPage
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import eu.kanade.tachiyomi.source.model.SMangaUpdate
import keiyoushi.annotation.Source
import keiyoushi.source.KeiSource
import okhttp3.HttpUrl

@Source
abstract class ThirstHub : KeiSource() {

    // TODO: browse. The API/HTML you need is at https://thirsthub.cc
    override suspend fun getPopularManga(page: Int): MangasPage = throw UnsupportedOperationException()

    override suspend fun getLatestUpdates(page: Int): MangasPage = throw UnsupportedOperationException()

    override suspend fun getSearchMangaList(page: Int, query: String, filters: FilterList): MangasPage =
        throw UnsupportedOperationException()

    // Resolves a pasted site URL (also used for deeplinks).
    override suspend fun getMangaByUrl(url: HttpUrl): SManga? = null

    // Details + chapter list for one series. Return the values you were given for the parts you skip.
    override suspend fun fetchMangaUpdate(
        manga: SManga,
        chapters: List<SChapter>,
        fetchDetails: Boolean,
        fetchChapters: Boolean,
    ): SMangaUpdate = throw UnsupportedOperationException()

    // The pages (images) of one chapter.
    override suspend fun getPageList(chapter: SChapter): List<Page> = throw UnsupportedOperationException()
}

package uk.co.sainsburys.product.finder.datasource

import uk.co.sainsburys.product.finder.model.Aile

interface AileRemoteDataSource {
    suspend fun getAile(productId: String): Aile
}
@file:Suppress("unused")

package uk.co.sainsburys.product.finder.usecase

import uk.co.sainsburys.product.finder.model.Aile
import kotlinx.coroutines.flow.Flow
import uk.co.sainsburys.Either
import kotlin.native.ObjCName

/**
 * Returns Flow<Either<Throwable, Aile>>
 */
fun interface GetAileFlow {
    /**
     * Returns Flow<Either<Throwable, Aile>>
     */
    @ObjCName("callAsFunction")
    suspend operator fun invoke(productId: String): Flow<Either<Throwable, Aile>>
}

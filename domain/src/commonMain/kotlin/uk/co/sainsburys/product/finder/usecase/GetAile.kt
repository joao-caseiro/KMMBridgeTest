@file:Suppress("unused")

package uk.co.sainsburys.product.finder.usecase

import uk.co.sainsburys.Either
import uk.co.sainsburys.product.finder.model.Aile
import kotlin.native.ObjCName

/**
 * Returns Either<Throwable, Aile>
 */
fun interface GetAile {
    /**
     * Returns Either<Throwable, Aile>
     */
    @ObjCName("callAsFunction")
    suspend operator fun invoke(productId: String): Either<Throwable, Aile>
}

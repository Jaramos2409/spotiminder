package gg.jrg.audiminder.core.presentation.usecase

/**
 * UseCase is a generic interface that represents a use case.
 *
 * @param Input The input type of the use case
 * @param Output The output type of the use case
 */
interface UseCase<in Input, out Output> {
    @Suppress("UNCHECKED_CAST")
    suspend operator fun invoke(input: Input = NoInput as Input): Output
}

object NoInput

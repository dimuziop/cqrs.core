package dev.dimuzio.cqrs.core.commands;

// TODO: Check this out
@FunctionalInterface
public interface CommandHandlerMethod<T extends BaseCommand> {
    void handle(BaseCommand command);
}

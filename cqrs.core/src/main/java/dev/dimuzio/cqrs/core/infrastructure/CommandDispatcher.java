package dev.dimuzio.cqrs.core.infrastructure;

import dev.dimuzio.cqrs.core.commands.BaseCommand;
import dev.dimuzio.cqrs.core.commands.CommandHandlerMethod;

//MEDIATOR
public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    <T extends BaseCommand> void send(T command);
}

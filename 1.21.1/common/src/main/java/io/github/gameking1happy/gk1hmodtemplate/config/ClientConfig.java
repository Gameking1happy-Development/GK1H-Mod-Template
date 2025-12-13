package io.github.gameking1happy.gk1hmodtemplate.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.RequiresAction;
import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.validation.misc.ValidatedBoolean;

import static io.github.gameking1happy.gk1hcore.data.CoreData.fnap;
import static io.github.gameking1happy.gk1hmodtemplate.Main.MOD_ID;
import static me.fzzyhmstrs.fzzy_config.annotations.Action.RELOG;

/**
 * The client configuration for the mod.
 */
@SuppressWarnings("CanBeFinal")
@RequiresAction(action = RELOG)
public class ClientConfig extends Config {
    /**
     * Example client configuration value.
     */
    @Comment("Example Client Config Value.")
    public ValidatedBoolean exampleClient = new ValidatedBoolean(true);
    /**
     * The constructor method.
     */
    public ClientConfig() {
        super(fnap(MOD_ID, "client_config"));
    }
}
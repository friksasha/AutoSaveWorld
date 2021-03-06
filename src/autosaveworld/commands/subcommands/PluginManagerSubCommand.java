/**
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 */

package autosaveworld.commands.subcommands;

import java.util.Arrays;
import java.util.List;

import org.bukkit.command.CommandSender;

import autosaveworld.commands.ISubCommand;
import autosaveworld.features.pluginmanager.PluginManager;
import autosaveworld.utils.StringUtils;

public class PluginManagerSubCommand implements ISubCommand {

	private final PluginManager pluginmanager = new PluginManager();

	@Override
	public void handle(CommandSender sender, String[] args) {
		String[] nameArray = Arrays.copyOfRange(args, 1, args.length);
		pluginmanager.handlePluginManagerCommand(sender, args[0], StringUtils.join(nameArray, " "));
	}

	@Override
	public List<String> tabComplete(CommandSender sender, String[] args) {
		return pluginmanager.getTabComplete(sender, args);
	}

	@Override
	public int getMinArguments() {
		return 2;
	}

}

package consulo.vaadin.flow.module.extension;

import consulo.annotation.component.ExtensionImpl;
import consulo.localize.LocalizeValue;
import consulo.module.content.layer.ModuleExtensionProvider;
import consulo.module.content.layer.ModuleRootLayer;
import consulo.module.extension.ModuleExtension;
import consulo.module.extension.MutableModuleExtension;
import consulo.ui.image.Image;
import consulo.vaadin.flow.icon.VaadinFlowIconGroup;
import consulo.vaadin.flow.localize.VaadinFlowLocalize;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

/**
 * @author VISTALL
 * @since 17/06/2023
 */
@ExtensionImpl
public class VaadinFlowModuleExtensionProvider implements ModuleExtensionProvider<VaadinFlowModuleExtension>
{
	@Nonnull
	@Override
	public String getId()
	{
		return "vaadin-flow";
	}

	@Nullable
	@Override
	public String getParentId()
	{
		return "java";
	}

	@Nonnull
	@Override
	public LocalizeValue getName()
	{
		return VaadinFlowLocalize.vaadinFlowModuleExtensionName();
	}

	@Nonnull
	@Override
	public Image getIcon()
	{
		return VaadinFlowIconGroup.vaadin();
	}

	@Nonnull
	@Override
	public ModuleExtension<VaadinFlowModuleExtension> createImmutableExtension(@Nonnull ModuleRootLayer moduleRootLayer)
	{
		return new VaadinFlowModuleExtension(getId(), moduleRootLayer);
	}

	@Nonnull
	@Override
	public MutableModuleExtension<VaadinFlowModuleExtension> createMutableExtension(@Nonnull ModuleRootLayer moduleRootLayer)
	{
		return new VaadinFlowMutableModuleExtension(getId(), moduleRootLayer);
	}
}

package consulo.vaadin.flow.module.extension;

import consulo.content.bundle.Sdk;
import consulo.disposer.Disposable;
import consulo.javascript.module.extension.JavaScriptMutableModuleExtension;
import consulo.language.version.LanguageVersion;
import consulo.module.content.layer.ModuleRootLayer;
import consulo.module.extension.MutableModuleInheritableNamedPointer;
import consulo.ui.Component;
import consulo.ui.annotation.RequiredUIAccess;
import jakarta.annotation.Nullable;

import javax.annotation.Nonnull;

/**
 * @author VISTALL
 * @since 17/06/2023
 */
public class VaadinFlowMutableModuleExtension extends VaadinFlowModuleExtension implements JavaScriptMutableModuleExtension<VaadinFlowModuleExtension>
{
	public VaadinFlowMutableModuleExtension(@Nonnull String id, @Nonnull ModuleRootLayer moduleRootLayer)
	{
		super(id, moduleRootLayer);
	}

	@Nonnull
	@Override
	public MutableModuleInheritableNamedPointer<Sdk> getInheritableSdk()
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public void setLanguageVersion(@Nonnull LanguageVersion languageVersion)
	{

	}

	@RequiredUIAccess
	@Nullable
	@Override
	public Component createConfigurationComponent(@Nonnull Disposable disposable, @Nonnull Runnable runnable)
	{
		return null;
	}

	@Override
	public void setEnabled(boolean b)
	{
		myIsEnabled = b;
	}

	@Override
	public boolean isModified(@Nonnull VaadinFlowModuleExtension extension)
	{
		return myIsEnabled != extension.isEnabled();
	}
}

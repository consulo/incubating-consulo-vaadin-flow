package consulo.vaadin.flow.module.extension;

import consulo.content.bundle.Sdk;
import consulo.content.bundle.SdkType;
import consulo.javascript.ecmascript.lang.EcmaScript12JavaScriptVersion;
import consulo.javascript.module.extension.JavaScriptModuleExtension;
import consulo.language.version.LanguageVersion;
import consulo.module.content.layer.ModuleRootLayer;
import consulo.module.content.layer.extension.ModuleExtensionBase;
import consulo.module.extension.ModuleInheritableNamedPointer;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

/**
 * @author VISTALL
 * @since 17/06/2023
 */
public class VaadinFlowModuleExtension extends ModuleExtensionBase<VaadinFlowModuleExtension> implements JavaScriptModuleExtension<VaadinFlowModuleExtension>
{
	public VaadinFlowModuleExtension(@Nonnull String id, @Nonnull ModuleRootLayer moduleRootLayer)
	{
		super(id, moduleRootLayer);
	}

	@Nonnull
	@Override
	public LanguageVersion getLanguageVersion()
	{
		return EcmaScript12JavaScriptVersion.getInstance();
	}

	@Nonnull
	@Override
	public ModuleInheritableNamedPointer<Sdk> getInheritableSdk()
	{
		throw new UnsupportedOperationException();
	}

	@Nullable
	@Override
	public Sdk getSdk()
	{
		return null;
	}

	@Nullable
	@Override
	public String getSdkName()
	{
		return null;
	}

	@Nonnull
	@Override
	public Class<? extends SdkType> getSdkTypeClass()
	{
		throw new UnsupportedOperationException();
	}
}

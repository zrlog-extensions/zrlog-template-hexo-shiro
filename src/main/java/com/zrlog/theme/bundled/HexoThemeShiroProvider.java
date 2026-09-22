package com.zrlog.theme.bundled;
import com.zrlog.theme.spi.BundledThemeProvider;
/** Registers the hexo-theme-shiro resources bundled in this JAR. */
public final class HexoThemeShiroProvider implements BundledThemeProvider {
 public String id() { return "hexo-theme-shiro"; }
 public String engine() { return "hexo"; }
 public String adapter() { return ""; }
 public boolean isDefault() { return false; }
}

package org.asciidoc.intellij.psi;

import com.intellij.navigation.NavigationItem;
import com.intellij.psi.StubBasedPsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface AsciiDocSection extends StubBasedPsiElement<AsciiDocSectionStub>, NavigationItem {
  @NotNull
  String getTitle();

  boolean matchesAutogeneratedId(String key);

  @Nullable
  AsciiDocBlockId getBlockId();

  String getAutogeneratedId();

  int headingLevel();
}

package io.github.kriolos.efatura.service;

import java.io.IOException;
import java.io.Writer;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ModLine {
	public void Write ( Writer w ) throws IOException;
}

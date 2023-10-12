package net.feng.processor;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes(
        "net.feng.anno.BuilderProperty")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class BuilderProcessor extends AbstractProcessor
{
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv)
    {
        return false;
    }
}

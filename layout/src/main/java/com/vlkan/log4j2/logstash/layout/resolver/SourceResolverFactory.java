package com.vlkan.log4j2.logstash.layout.resolver;

class SourceResolverFactory implements TemplateResolverFactory<SourceResolver> {

    private static final SourceResolverFactory INSTANCE = new SourceResolverFactory();

    private SourceResolverFactory() {}

    static SourceResolverFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public String getName() {
        return SourceResolver.getName();
    }

    @Override
    public SourceResolver create(TemplateResolverContext context, String key) {
        return new SourceResolver(context, key);
    }

}

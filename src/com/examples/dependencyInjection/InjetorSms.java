package com.examples.dependencyInjection;

/**
 * Created by ricardo on 2/13/17.
 */
public class InjetorSms implements IInjetor {
    @Override
    public IServicoMsg getMessageService() {
        return new ServicoSms();
    }
}
